import javafx.scene.control.Button;

public class StudentTM {
    private long id;
    private String name;
    private String Address;
    private Button deleteButton;
    private Button updateButton;

    public StudentTM() {
    }

    public StudentTM(long id, String name, String address, Button deleteButton, Button updateButton) {
        this.id = id;
        this.name = name;
        Address = address;
        this.deleteButton = deleteButton;
        this.updateButton = updateButton;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Button getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(Button deleteButton) {
        this.deleteButton = deleteButton;
    }

    public Button getUpdateButton() {
        return updateButton;
    }

    public void setUpdateButton(Button updateButton) {
        this.updateButton = updateButton;
    }

    @Override
    public String toString() {
        return "StudentTM{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", deleteButton=" + deleteButton +
                ", updateButton=" + updateButton +
                '}';
    }
}
