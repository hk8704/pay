package phoneseller.external;

public class Marketing {

    private Long id;
    private Long orderId;
    private Double point;
    private String process;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Double getPoint() {
        return point;
    }
    public void setPoint(Double point) {
        this.point = point;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }
}
