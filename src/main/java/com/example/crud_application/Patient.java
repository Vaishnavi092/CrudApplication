
@Entity
public class Patient{

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.is=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}