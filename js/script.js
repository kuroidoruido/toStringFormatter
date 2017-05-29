$('#pending-indicator').hide();
$('#output').hide();

function formatToString(input) {
	var output = "";
	if(input.length > 3) {
		output += addFormat('',input[0],input[1]);
		for(var i=1 ; i<input.length-1 ; i++) {
			output += addFormat(input[i-1],input[i],input[i+1],output[output.length-1]);
		}
		output += addFormat(input[input.length-2],input[input.length-1],'',output[output.length-1]);
	}
	output = correctTextWithComma(output);
	output = replaceSpecialChars(output);
	return output;
}

var indent = "";

function addFormat(previousChar,current,nextChar,lastOutputChar) {
	var output = [];
	
	if(lastOutputChar === '\n' && !(current === ']' || current === '}' || /\s/.test(current))) {
		output.push(indent);
	}
	
	if(current === '[' || current === '{') {
		output.push(current);
		output.push('\n');
		indent += "\t";
	} else if(current === ']' || current === '}') {
		indent = indent.substring(1);
		output.push(indent);
		output.push(current);
		if(nextChar !== ',') {
			output.push('\n');
		}
	} else if(current === ',' || (nextChar === ']' || nextChar === '}')) {
		output.push(current);
		output.push('\n');
	} else if(/\s/.test(current) && previousChar === ',') {
		output.push('');
	} else {
		output.push(current);
	}

	return output.join('');
}

function correctTextWithComma(str) {
	var input = str.split("\n");
	var output = "";
	for(i in input) {
		var line = input[i];
		if(output.length > 1 
		&& output[output.length-2] === ','
		&& line.indexOf('=') === -1
		&& line.indexOf('[') === -1 && line.indexOf(']') === -1
		&& line.indexOf('{') === -1 && line.indexOf('}') === -1
		) {
			output = output.slice(0,-1);
			line = line.trim();
		}
		output += line + "\n";
	}
	return output;
}
function replaceSpecialChars(str) {
	return str.replace(/\t/g,'    ');
}

function isUpperCase(ch) {
	if (!isNaN(ch * 1)) {
        return false;
    } else {
        if (ch == ch.toUpperCase()) {
            return true;
        }
    }
    return false;
}

var handler = (event) => {
	$('#output').hide();
	$('#pending-indicator').show();

	var input = $('#input').val();
	
	new Promise((resolve,reject) => {
		resolve(formatToString(input));
	}).then((result) => {
		$('#output').text(result);
		
		$('#output').show();
		var nbLine = $('#output').val().match(/\n/g).length;
		$('#output').css('height',Math.round(1.5*nbLine)+'em');

		$('#pending-indicator').hide();
	});
	
};

$('#input').change(handler);
