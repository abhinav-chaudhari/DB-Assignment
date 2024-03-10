import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Product_Category")
public class ProductCategory{
  @Id
  @GeratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Column(columnDefinition = "TEXT")
  private String desc;

  @Temporal(TemporalType.TIMESTAMP)
  private Date created_at;

  @Temporal(TemporalType.TIMESTAMP)
  private Date modified_at;

  @Temporal(TemporalType.TIMESTAMP)
  private Date deleted_at;
}
  @Entity
  @Table(name = "Product_Inventory")
  public class ProductInventory{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modified_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted_at;

    // Getters and setters
  }
  @Entity
  @Table(name = "discount")
  public class Discount{
    @Id
    @GenerationValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String desc;

    private BigDecimal discount_percent;

  @Temporal(TemporalType.TIMESTAMP)
  private Date created_at;

  @Temporal(TemporalType.TIMESTAMP)
  private Date modified_at;

  @Temporal(TemporalType.TIMESTAMP)
  private Date deleted_at;
  }

@Entity
@Table(name = "Product")
public class Product{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Column(columnDefinition = "TEXT")
  private String desc;

  private String SKU;

  @ManyToOne
  @JoinColumn(name = "Inventory_Id")
  private ProductInventory inventory;

  private BigDecimal price;

  @ManyToOne
  @JoinColumn(name = "Discount_Id")
  private Discount discount;

  
  @Temporal(TemporalType.TIMESTAMP)
  private Date created_at;

  @Temporal(TemporalType.TIMESTAMP)
  private Date modified_at;

  @Temporal(TemporalType.TIMESTAMP)
  private Date deleted_at;
  }
  
