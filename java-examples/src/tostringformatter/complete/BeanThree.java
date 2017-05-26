package tostringformatter.complete;

import java.util.Map;

public class BeanThree {
	private Map<String, BeanTwo> propMap;

	public BeanThree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanThree(Map<String, BeanTwo> propMap) {
		super();
		this.propMap = propMap;
	}

	public Map<String, BeanTwo> getPropMap() {
		return propMap;
	}

	public void setPropMap(Map<String, BeanTwo> propMap) {
		this.propMap = propMap;
	}

	@Override
	public String toString() {
		return "BeanThree [propMap=" + propMap + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((propMap == null) ? 0 : propMap.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeanThree other = (BeanThree) obj;
		if (propMap == null) {
			if (other.propMap != null)
				return false;
		} else if (!propMap.equals(other.propMap))
			return false;
		return true;
	}

}
