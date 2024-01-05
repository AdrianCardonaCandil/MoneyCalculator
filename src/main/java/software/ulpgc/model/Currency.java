package software.ulpgc.model;

// Class representing a currency. A currency has a code (unique identifier) and a name.
public record Currency (String code, String name) {
    @Override
    public String toString(){
        return this.code + "-" + this.name;
    }
}