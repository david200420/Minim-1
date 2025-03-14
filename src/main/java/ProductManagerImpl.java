import models.Order;
import models.Product;
import models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManagerImpl implements ProductManager {
    private List<Product> productList;
    private Queue<Order> orderQueue;
    private HashMap<String, User> users;
    private static final Logger logger = LogManager.getLogger(ProductManagerImpl.class);
    private static ProductManagerImpl instance;

    public static ProductManagerImpl getInstance() { //Se crea una instancia para poder tener una comun entre los diferentes clientes
        if (instance == null) {
            instance = new ProductManagerImpl();
        }
        return instance;
    }

    public ProductManagerImpl() {
        productList = new ArrayList<>();
        orderQueue = new LinkedList<>();
    }

    @Override
    public void addProduct(String id, String name, double price) {
        logger.info("Adding product with id " + id + " and name " + name);
        productList.add(new Product(1, name));

    }

    @Override
    public List<Product> getProductsByPrice() {
        logger.info("Getting products by price");
        productList.sort(Comparator.comparing(Product::getPreu).reversed());
        return productList;
    }

    @Override
    public void addOrder(Order order) {
        orderQueue.add(order);
    }

    @Override
    public int numOrders() {
        return orderQueue.size();
    }

    @Override
    public Order deliverOrder() {
        Order order = orderQueue.poll();
        return order;
    }

    @Override
        public Product getProduct (String c1) {
            for (Product p : this.productList) {
                if (p.getNom().equals(c1)) {
                return p;
                }
            }
            return null;
        }

    @Override
    public User getUser(String number) {
        return null;
    }
}
