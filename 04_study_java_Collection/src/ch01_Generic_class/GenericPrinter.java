package ch01_Generic_class;

// ������ �� �����Ϸ��� <T>�ڸ��� ���� Ŭ������ ������ ��� T�� �������� 
public class GenericPrinter<T> {
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