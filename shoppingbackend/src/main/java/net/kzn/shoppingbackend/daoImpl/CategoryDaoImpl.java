package net.kzn.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDao;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao{

	private static List<Category> categories=new ArrayList<>();
	
	static{
		
	  Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is description for television");
		category.setImageUrl("CAT_1.png");
		categories.add(category);

		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is description for Mobile");
		category.setImageUrl("CAT_1.png");
		categories.add(category);

		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is description for Laptop");
		category.setImageUrl("CAT_1.png");
		categories.add(category);
}
	
	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		
		//enhanced for loop
		for(Category category:categories){
			if(category.getId()==id)return category;
		}
		
		return null;
	}

}
