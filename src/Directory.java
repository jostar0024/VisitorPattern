import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Directory extends Entry implements Iterable<Entry>{

	private final String m_name;
	private List<Entry> m_directory = new ArrayList<>();
	
	public Directory(final String name) {
		m_name = name;
	}
	@Override
	public String getName() {
		return m_name;
	}

	@Override
	public int getSize() {
		return m_directory.stream()
						  .collect(Collectors.summingInt(entry -> entry.getSize()));
	}
	
	//ディレクトリエントリをディレクトリに追加する
	public Entry add(final Entry entry) {
		m_directory.add(entry);
		return this;
	}
	@Override
	public void accept(final Visitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public Iterator<Entry> iterator() {
		return m_directory.iterator();
	}

}
