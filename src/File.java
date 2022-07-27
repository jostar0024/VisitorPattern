
public class File extends Entry{
	private final String m_name;
	private final int m_size;
	
	public File(final String name, final int size) {
		m_name = name;
		m_size = size;
	}

	@Override
	public String getName() {
		return m_name;
	}

	@Override
	public int getSize() {
		return m_size;
	}

	@Override
	public void accept(final Visitor visitor) {
		visitor.visit(this);
	}

}
