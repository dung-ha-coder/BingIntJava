package appjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class AppJava {

    public static boolean nhap(List list, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap chuoi so thu: " + (i + 1));
            String chuoiSo = new Scanner(System.in).nextLine();
            Stack stack = new Stack();
            for (int j = 0; j < chuoiSo.length(); j++) {
                String temp = chuoiSo.substring(j, j + 1);
                try {
                    int so = Integer.parseInt(temp);
                    stack.push(so);
                } catch (NumberFormatException e) {
                    return false;
                }

            }

            list.add(stack);
        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(list.get(i));
//        }

        return true;
    }

    public static void tinhTong(List list, int n, Stack tong) {
        int soNho = 0;
        while (list.isEmpty() == false) {
            int tongCacSo = 0;
            for (int i = 0; i < list.size(); i++) {
                int temp = (int) ((Stack) list.get(i)).pop();
                tongCacSo = tongCacSo + temp;
                if (((Stack) list.get(i)).empty() == true) {
                    list.remove(i);
                    i--;
                }

            }
            tongCacSo = tongCacSo + soNho;
            soNho = tongCacSo / 10;

            if (list.isEmpty() == true && soNho != 0) {
                tong.push(soNho);
            }
            tong.push(tongCacSo % 10);

        }

    }

    public static void inKetQua(Stack tong) {
        while (tong.empty() == false) {
            System.out.print(tong.pop());
        }
    }

    public static void main(String[] args) {
        List list = new ArrayList<>();

        System.out.print("Nhap so phep toan: ");
        int n = new Scanner(System.in).nextInt();
        if (nhap(list, n) == true) {
            Stack tong = new Stack();
            tinhTong(list, n, tong);
            System.out.println("Ket qua cua phep toan la: ");
            inKetQua(tong);
            System.out.println("");
        } else {
            System.out.println("Chuoi nhap vao khong phai la so nen khong cong duoc");
        }
//        System.out.println("------------------------");
//        String kq = "207934555049339734969992410935986981198263395802957596305929796164551625363586342622003480523699430463178679832796035220647339258677859222414953317101113896074184726032173728828581013228614052251694061511805124491275564456912411756447598496459450543906482153270497448125527460110728344403136425767823596722987605566207744305259080659607024967678753324078317889069754344283738746899700254225653982455815000418007341990384029893434374293076429548131373360602821081268870029601929468530389068320284247751092052126719921393778093012486777193501035414274500356151147386340479653013613828516168098636632965862415477645401843788607058949004333519606873245243895933518667225455296234072382867149171506476503710469087404738792810681595124908205072116354128056530671227992727090084782118211470562776747244957984223590035135956260507867643957198981578865807431859374901930389984269479336929790709000079243334318434562640399661712961694993745665838217202711001733575649873884977297865043861587985765971980951504389362524070049269252319513026600466635260061899539262505362334854510967771217167160830533326885106162334373967578054935831062519871040718180579685559912020553870841694582419582368959791328432179615399032545809614101047556449505084648483316163906764283222867592374644399759614967234029027164890347774671573986932057695962301409524145672425536919960224380752346424350852862648552948473084498374351230093897158615812281753323315003245804275155822632707579292603459573186323562297581197470216581602128716396657985326379329744083510140431165040503769751256200472091079249312956242662172406112667367173106929402972455296265770711777417524557694157801445987447832069650281643184968271442833631927947019938859186989555379282065401889861776317603613265657104806189644019972678665165790500029256281959825549418026982243783958504021049755702301355720608510144106426";
//        System.out.println(kq.length());

    }

}
