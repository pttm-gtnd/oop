public class Introduction {
  public static void main (String[] args){
    System.out.println ("Họ Tên:\t<Phạm Thị Trà My>\t" +
            "Mã SV:\t<24020242>\t" +
            "Lớp:\t<2526I INT2204 6>\t" +
            "GitHub:\t<pttm-gtnd>\t" +
            "Email:\t<24020242@vnu.vn>"
            );
    for(int i = 9; i >=1; i--) {
      String bottleWorld = (i == 1) ? "bottle" : "bottles";
      System.out.println(i + " " + bottleWorld + "of beer on the wall, " + i + " " + bottleWorld + " of beer.");
      System.out.println("Take one down, pass it around,");
    }
    System.out.println("No more bottles of beer on the wall.");
  }
}
        
