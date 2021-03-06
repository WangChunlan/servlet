package shopping.dao;

import shopping.entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangchunlan
 * @ClassName ProductDAO.java
 * @Description
 * @createTime 2019年06月11日 14:10:00
 */

public class ProductDAO {

    public static void main(String[] args) {

        System.out.println(new ProductDAO().ListProduct().size());

    }

    public List<Product> ListProduct() {
        List<Product> products = new ArrayList<Product>();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=UTF-8",
                    "root", "root");

            String sql = "select * from product order by id desc";

            PreparedStatement ps = c.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                int id = rs.getInt(1);
                String name = rs.getString(2);
                float price = rs.getFloat(3);

                product.setId(id);
                product.setName(name);
                product.setPrice(price);
                products.add(product);

            }

            ps.close();

            c.close();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return products;
    }
}