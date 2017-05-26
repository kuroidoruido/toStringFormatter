package tostringformatter.complete;

import java.util.List;

public class BeanTwo {
	private List<BeanOne> propBeanTwo;

	public BeanTwo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanTwo(List<BeanOne> propBean2) {
		super();
		this.propBeanTwo = propBean2;
	}

	public List<BeanOne> getPropBean2() {
		return propBeanTwo;
	}

	public void setPropBean2(List<BeanOne> propBean2) {
		this.propBeanTwo = propBean2;
	}

	@Override
	public String toString() {
		return "BeanTwo [propBeanTwo=" + propBeanTwo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((propBeanTwo == null) ? 0 : propBeanTwo.hashCode());
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
		BeanTwo other = (BeanTwo) obj;
		if (propBeanTwo == null) {
			if (other.propBeanTwo != null)
				return false;
		} else if (!propBeanTwo.equals(other.propBeanTwo))
			return false;
		return true;
	}

}
