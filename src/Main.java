
public class Main {
	public static void main(String[] args) {
		System.out.println("Making root entries...");
		final Directory rootdir = new Directory("root");
		final Directory bindir = new Directory("bin");
		final Directory userdir = new Directory("user");
		
		rootdir.add(bindir);
		rootdir.add(userdir);
		bindir.add(new File("vi",10000));
		bindir.add(new File("latex",20000));
		
		rootdir.accept(new ListVisitor());
		System.out.println();
	}

}
