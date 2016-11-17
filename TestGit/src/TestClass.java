
public class TestClass {
	int kreygasm;

	TestClass(int k) {
		this.kreygasm = k;
	}

	boolean tru() {
		return true;
	}

	boolean fal() {
		if (this.kreygasm == 0) {
			return false;
		} else {
			return true;
		}
	}
}
