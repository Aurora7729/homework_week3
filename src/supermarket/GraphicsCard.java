package supermarket;

import java.util.Date;

public class GraphicsCard extends MerchandiseV2 implements ExpireDateMerchandise {
    private Date produceDate;
    private Date expirationDate;

    private String Core_Architecture;

    private String Process_technology;

    private String Memory_Type;

    private int Memory_Size;

    private int Cuda_Num;

    private double TDP;

    public GraphicsCard(String name, String id, int count, double soldPrice, double purchasePrice, Category category,
                        String Core_Architecture, String Process_technology, String Memory_Type,int Memory_Size,
                        int Cuda_Num, double TDP, Date produceDate, Date expirationDate) {
        super(name, id, count, soldPrice, purchasePrice, category);
        this.Core_Architecture = Core_Architecture;
        this.Process_technology = Process_technology;
        this.Memory_Type = Memory_Type;
        this.Memory_Size = Memory_Size;
        this.Cuda_Num = Cuda_Num;
        this.TDP = TDP;
        this.produceDate = produceDate;
        this.expirationDate = expirationDate;

    }

    public void describeGraphics() {
        System.out.println("此显卡商品属性如下");
        System.out.println("核心架构为" + Core_Architecture + "\n" +
                "制程工艺:" + Process_technology + "\n" +
                "显存类型：" + Memory_Type + " \n" +
                "显存大小：" + Memory_Size + " \n" +
                "流处理器核心数：" + Cuda_Num + "个\n" +
                "功耗" + TDP + "W\n");

    }

    @Override
    public Date getProducedDate() {
        return produceDate;
    }

    @Override
    public Date getExpireDate() {
        return expirationDate;
    }

    @Override
    public double actualValueNow(double leftDatePercentage) {
        return super.getSoldPrice();
    }
}
