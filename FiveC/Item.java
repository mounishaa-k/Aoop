package DEMO;

class Item {
    private String name;
    private String creator;
    private String code;
    private boolean status;

    public Item(String name, String creator, String code) {
        this.name = name;
        this.creator = creator;
        this.code = code;
        this.status = true;
        System.out.println("Item created: " + name + " by " + creator);
    }
    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }

    public String getCode() {
        return code;
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
        System.out.println("Item status updated: " + name + " is now " + (status ? "available" : "not available"));
    }
}


