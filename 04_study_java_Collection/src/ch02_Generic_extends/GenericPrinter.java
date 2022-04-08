package ch02_Generic_extends;

// 컴파일 시 컴파일러가 <T>자리에 들어온 클래스로 나머지 모든 T를 변경해줌 
public class GenericPrinter<T extends Material> {
	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}

	public T getMaterial() {
		return material;
	}

	public String toString() {
		return material.toString();
	}
}