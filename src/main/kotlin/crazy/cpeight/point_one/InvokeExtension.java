package crazy.cpeight.point_one;

public class InvokeExtension {

    public static void main(String[] args) {
        Raw t=new Raw();
        t.test();
        Raw_infoKt.info(t);

        RawSub rs=new RawSub();
        rs.test();
        rs.sub();
        Raw_infoKt.info(rs);

    }
}
