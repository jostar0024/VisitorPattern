
public class ListVisitor extends Visitor{
	private String m_currentDir = "";
	
	//File訪問時
	@Override
	public void visit(final File file) {
		System.out.println(m_currentDir + "/" + file);
	}

	//Directory訪問時
	@Override
	public void visit(final Directory directory) {
		System.out.println(m_currentDir + "/" + directory);
		final String saveDir = m_currentDir;
		m_currentDir = m_currentDir + "/" + directory.getName();
		directory.forEach(entry -> entry.accept(this));
		m_currentDir = saveDir;
	}

}
