package testeJenkins;

public class teste {
	
	private int x;
	private int y;
	
	public teste(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int soma() {
		 return x+y;
	}
	
	public int multiplicar() {
		return x*y;
	}
	
	public int subtracao() {
		return x-y;
	}

	public static void main(String[] args) {	
		teste t = new teste(1,2);
		
		System.out.println("hello world");
		System.out.println(t.soma());
		System.out.println(t.multiplicar());
		System.out.println(t.subtracao());
	}
}