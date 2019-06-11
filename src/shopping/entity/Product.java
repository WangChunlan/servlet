package shopping.entity;

/**
 * @author wangchunlan
 * @ClassName Product.java
 * @Description
 * @createTime 2019年06月11日 14:08:00
 */
public class Product {

    private int id;
    private String name;
    private float price;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

}
