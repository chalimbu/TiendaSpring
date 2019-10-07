package co.com.poli.tienda.model;

import java.util.Objects;

public class Producto {
    private Long id;
    private String name;
    private String description;
    private Boolean state;

    public Producto() {
    }

    public Producto(Long id) {
        this.id = id;
    }

    public Producto(Long id, String name, String description, Boolean state) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id.equals(producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
