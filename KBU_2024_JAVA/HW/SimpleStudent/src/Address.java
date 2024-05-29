class Address {
    private final String city; // 도시
    private final String state; // 도 이름
    private final String streetAddress; // 도로 주소

    // 생성자
    public Address(String city, String state, String streetAddress) {
        this.city = city;
        this.state = state;
        this.streetAddress = streetAddress;
    }

    // getInfo 메서드: 도로 주소, 도시, 도 이름을 String 형으로 반환
    public String getInfo() {
        return city + ", " + state + ", " + streetAddress;
    }
}
