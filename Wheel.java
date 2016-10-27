package Car;


    class Wheel {

    private String type;
    private String mark;

    Wheel(String type, String mark) {
       this.mark = mark;
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setType(String type) {
        this.type = type;
    }
}
