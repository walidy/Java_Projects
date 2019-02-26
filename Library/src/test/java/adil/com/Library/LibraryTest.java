package adil.com.Library;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LibraryTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void bookItemTest() {
		Books Alchemist = new Books("Paulo Coelho", 1988, 101, "");
		assertNotNull(Alchemist);
	}

	@Test
	public void mapsItemTest() {
		Maps Ethiopia = new Maps("Adonay G", 2018, 102, true);
		assertNotNull(Ethiopia);
	}

	@Test
	public void dissertationsItemTest() {
		Dissertations MathsWiz = new Dissertations("Adil Oozeerally", 2017, 103, "Digital");
		assertNotNull(MathsWiz);
	}

	@Test
	public void bookBackType() {
		Books Alchemist = new Books("Paulo Coelho", 1988, 101, " ");

		String backType = " ";

		Alchemist.setBackType("Paper");

		System.out.println(Alchemist.getBackType());

		assertEquals("Paper", Alchemist.getBackType());

	}

	@Test
	public void mapsCopy() {
		Maps Ethiopia = new Maps("Adonay G", 2018, 102, true);

		Boolean canCopy = null;

		Ethiopia.setCopy(true);

		System.out.println(Ethiopia.getCopy());

		assertEquals(true, Ethiopia.getCopy());

	}

	@Test
	public void dissertationsFormat() {
		Dissertations MathsWiz = new Dissertations("Adil Oozeerally", 2018, 103, "");

		String format = "";

		MathsWiz.setFormat("Digital");

		System.out.println(MathsWiz.getFormat());

		assertEquals("Digital", MathsWiz.getFormat());
	}

	@Test
	public void addItemsTest() {
		
		Books Alchemist = new Books("Paulo Coelho", 1988, 101, "Paper");
		

		List<Object> itemList = new ArrayList<Object>();

		Items.itemList.add(Alchemist);
		
		System.out.println(itemList);

	}

}
