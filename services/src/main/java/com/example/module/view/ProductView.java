public class ProductView {
    private final ProducController producController;
    public ProductView(ProducController producController) {
        this.producController = producController;
    }
    public void showMenu(){
     System.out.println("Menu");
     System.out.println("1. Find Product by ID");
     System.out.println("2. Find Product by Name");
     System.out.println("3. Find Product by Price");
     System.out.println("4. Order by Price");
     System.out.println("5. Order by Name");
     System.out.println("6. Calculate Total");
     System.out.println("7. Calculate Average");
     System.out.println("8. Calculate Min");
     System.out.println("9. Calculate Max");
     System.out.println("10. Calculate Count");
     System.out.println("11. Exit");
     int option = Integer.parseInt(System.console().readLine());
     switch (option) {
        case 1:
            findProductById();
            break;
        case 2:
            findProductByName();
            break;
        case 3:
            findProductByPrice();
            break;
        case 4:
            orderByPrice();
            break;
        case 5:
            orderByName();
            break;
        case 6:
            calculateTotal();
            break;
        case 7:
            calculateAverage();
            break;
        case 8:
            break;
        case 9:
            break;
        case 10:
            break;
        case 11:
            break;
        default:
            break;
     }
    }
    public void findProductById(){
        System.out.println("Enter the ID of the product");
        String id = System.console().readLine();
        Optional<ProductModel> product = producController.findProduct(id);
        if(product.isPresent()){
            System.out.println(product.get());
        }else{
            System.out.println("Product not found");
        }
    }
    public void findProductByName(){
        System.out.println("Enter the name of the product");
        String name = System.console().readLine();
        Optional<ProductModel> product = producController.findProduct(name);
        if(product.isPresent()){
            System.out.println(product.get());
        }else{
            System.out.println("Product not found");
        }
    }
    public void findProductByPrice(){
        System.out.println("Enter the price of the product");
        String price = System.console().readLine();
        Optional<ProductModel> product = producController.findByPrice(price);
        if(product.isPresent()){
            System.out.println(product.get());
        }else{
            System.out.println("Product not found");
        }
    }
    public void orderByPrice(){
        System.out.println("Enter the price of the product");
        String price = System.console().readLine();
        Optional<ProductModel> product = producController.findByPrice(price);
        if(product.isPresent()){
            System.out.println(product.get());
        }else{
            System.out.println("Product not found");
        }
    }
    public void orderByPrice(){
        System.out.println("Enter the price of the product");
        String price = System.console().readLine();
        Optional<ProductModel> product = producController.findByPrice(price);
        if(product.isPresent()){
            System.out.println(product.get());
        }else{
            System.out.println("Product not found");
        }
    }
    public void orderByName(){
        System.out.println("Enter the name of the product");
        String name = System.console().readLine();
        Optional<ProductModel> product = producController.findProduct(name);
        if(product.isPresent()){
            System.out.println(product.get());
        }else{
            System.out.println("Product not found");
        }
    }
    public void calculateTotal(){
        System.out.println("Enter the price of the product");
        String price = System.console().readLine();
        Optional<ProductModel> product = producController.findByPrice(price);
        if(product.isPresent()){
            System.out.println(product.get());
        }else{
            System.out.println("Product not found");
        }
    }
    public void calculateAverage(){
        System.out.println("Enter the price of the product");
        String price = System.console().readLine();
        Optional<ProductModel> product = producController.findByPrice(price);
        if(product.isPresent()){
            System.out.println(product.get());
        }else{
            System.out.println("Product not found");
        }
    }
    public void calculateMin(){
        System.out.println("Enter the price of the product");
        String price = System.console().readLine();
        Optional<ProductModel> product = producController.findByPrice(price);
        if(product.isPresent()){
            System.out.println(product.get());
        }else{
            System.out.println("Product not found");
        }
    }
    public void calculateMax(){
        System.out.println("Enter the price of the product");
        String price = System.console().readLine();
        Optional<ProductModel> product = producController.findByPrice(price);
        if(product.isPresent()){
            System.out.println(product.get());
        }else{
            System.out.println("Product not found");
        }
    }
    public void calculateCount(){
        System.out.println("Enter the price of the product");
        String price = System.console().readLine();
        Optional<ProductModel> product = producController.findByPrice(price);
        if(product.isPresent()){
            System.out.println(product.get());
        }else{
            System.out.println("Product not found");
        }
    }
}