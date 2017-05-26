package tostringformatter.complete;

public class BeanOne {
	private String propStr1;
	private int propInt1;

	public BeanOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanOne(String propStr1, int propInt1) {
		super();
		this.propStr1 = propStr1;
		this.propInt1 = propInt1;
	}

	public String getPropStr1() {
		return propStr1;
	}

	public void setPropStr1(String propStr1) {
		this.propStr1 = propStr1;
	}

	public int getPropInt1() {
		return propInt1;
	}

	public void setPropInt1(int propInt1) {
		this.propInt1 = propInt1;
	}

	@Override
	public String toString() {
		return "BeanOne [propStr1=" + propStr1 + ", propInt1=" + propInt1 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + propInt1;
		result = prime * result + ((propStr1 == null) ? 0 : propStr1.hashCode());
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
		BeanOne other = (BeanOne) obj;
		if (propInt1 != other.propInt1)
			return false;
		if (propStr1 == null) {
			if (other.propStr1 != null)
				return false;
		} else if (!propStr1.equals(other.propStr1))
			return false;
		return true;
	}

}
