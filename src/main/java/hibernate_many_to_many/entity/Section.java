package hibernate_many_to_many.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;


    @ManyToMany(cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.PERSIST
    },fetch = FetchType.LAZY)
    @JoinTable(
            name = "child_section",
            joinColumns = @JoinColumn(name = "section_id"),
            inverseJoinColumns = @JoinColumn(name="child_id")
    )
    private List<Child> children;

    public Section() {
    }

    public Section(String name) {
        this.name = name;
    }

    public void addChildToSection(Child child)
    {
        if(children==null)
        {
            children=new ArrayList<>();
        }
        children.add(child);
    }
    public void removeChildFromSection(Child child){
        try
        {
          if(children.isEmpty()==false)
              children.remove(child);
            System.out.println(child.getFirstName()+" удален из секции");
        }
        catch (Exception e)
        {
            System.out.println("Произошла ошибка:"+e.getMessage());
        }
    }


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

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
