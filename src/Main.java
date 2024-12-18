import java.util.*;

public class Main{
    public static void main(String[] args) {
        ProductService service = new ProductService();
        // hey service add the products
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Table", 2022));
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2825));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2824));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

        // printing all the products
        List<Product> products = service.getAllProduct();
        
        // enhanced for loop
        for(Product prod : products){
            System.out.println(prod);
        }
        System.out.println("============================================================");

        // to print specific product
        // eg want to check where is the logitech mouse
        System.out.println("A partiular product: ");
        Product p = service.getProduct("Logi Mouse");
        System.out.println(p);

        System.out.println("Out of warranty products: ");
        List<Product> outWarrProd = service.getProductOutOfWarranty();
        for(Product prod : outWarrProd){
            System.out.println(prod);
        }
        
        System.out.println("Black products: ");
        List<Product> prods = service.getProductWithText("black");
        for(Product prod : prods){
            System.out.println(prod);
        }
    }
}

