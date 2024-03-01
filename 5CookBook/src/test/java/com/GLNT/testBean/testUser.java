//package com.GLNT.testBean;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import java.util.ArrayList;
//
//import org.junit.jupiter.api.Test;
//
//import com.GLNT.bean.Recipe;
//import com.GLNT.bean.User;
//
//class testUser {
//
//	@Test
//	void testConstructorWithNoValue() {
//		User user = new User();
//		assertNotNull(user);
//	}
//
//	@Test
//	void testConstructorWithUsername() {
//		User user = new User("tomcat");
//		String username = user.getUsername();
//		assertEquals("tomcat", username);
//	}
//
//	@Test
//	void testConstructorWithUsernameAndId() {
//		User user = new User(5, "tomcat");
//		int id = user.getId();
//		String username = user.getUsername();
//		assertEquals(5, id);
//		assertEquals("tomcat", username);
//	}
//
//	@Test
//	void testGetId() {
//		User user = new User(5, "tomcat");
//		int id = user.getId();
//		assertEquals(5, id);
//	}
//
//	@Test
//	void testGetUsername() {
//		User user = new User(5, "tomcat");
//		String username = user.getUsername();
//		assertEquals("tomcat", username);
//	}
//
//	@Test
//	void testGetConnexionStatus() {
//		User user = new User(5, "tomcat");
//		boolean connexion = user.getConnexionStatus();
//		assertEquals(false, connexion);
//	}
//
//	@Test
//	void testGetRecipes() {
//		User user = new User(5, "tomcat");
//		ArrayList<Recipe> re = user.getRecipes();
//		assertEquals(0, re.size());
//	}
//
//	@Test
//	void testSetUsername() {
//		User user = new User();
//		user.setUsername("tomcat");
//		String username = user.getUsername();
//		assertEquals("tomcat", username);
//	}
//
//	@Test
//	void testSetConnexionStatus() {
//		User user = new User();
//		user.setConnexionStatus(true);
//		boolean conn = user.getConnexionStatus();
//		assertEquals(true, conn);
//	}
//
//	@Test
//	void testSetRecipes() {
//		Recipe re = new Recipe();
//		ArrayList<Recipe> recipes = new ArrayList<Recipe>();
//		recipes.add(re);
//		User user = new User();
//		user.setRecipes(recipes);
//		ArrayList<Recipe> recs = user.getRecipes();
//		assertEquals(1, recs.size());
//	}
//
//	@Test
//	void isConnected() {
//		// TODO
//	}
//
//	@Test
//	void addRecipe() {
//		User user = new User();
//		Recipe re = new Recipe();
//		user.addRecipe(re);
//		ArrayList<Recipe> recs = user.getRecipes();
//		assertEquals(1, recs.size());
//	}
//
//	@Test
//	void seeOneRecipe() {
//		User user = new User();
//		Recipe re = new Recipe(1, "Pasta", "A great recipe");
//		ArrayList<Recipe> recipes = new ArrayList<Recipe>();
//		recipes.add(re);
//		user.setRecipes(recipes);
//		Recipe rec = user.seeOneRecipe(1);
//		assertEquals("Pasta", rec.getTitle());
//		// test is red now because not yet implemented
//	}
//}
