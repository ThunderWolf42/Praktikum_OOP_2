import java.util.Date;
class hitungTotal{
    public static void main(String[] args){
        int jumlah=0;
        Date mulai,selesai;

        String timeStamp = new java.text.SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
                Date());
        System.out.println("Waktu mulai: "+timeStamp);
        for (int i=1;i<=100;i++){
            jumlah=jumlah+i;
            System.out.println("Angka ke: "+i+" jumlahnya: "+jumlah);
        }
        System.out.println("Waktu proses: "+timeStamp);
    }
}