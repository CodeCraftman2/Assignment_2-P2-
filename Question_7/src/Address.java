public class Address {
    private String plotNo;
    private String at;
    private String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }


    public String toString() {
        return "Address{" +
                "plotNo='" + plotNo + '\'' +
                ", at='" + at + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
