package org.example;

public class Main {
    public static void main(String[] args) {
        final int ARR_MIN = -50;
        final int ARR_MAX = 50;
        modalDialog<Boolean> modDialog = null;
        insertDialog inDialog1 = null;
        insertDialog inDialog2 = null;
        insertDialog inDialog3 = null;
        try {
            modDialog = new <Boolean> modalDialog("Do you want to try again?", new String[]{"no", "yes"}, new Boolean[]{true, false} );
            inDialog1 = new insertDialog("Please, set X of array");
            inDialog2 = new insertDialog("Please, set Y of array");
            inDialog3 = new insertDialog("Please, set num to compare");
        } catch (Exception e) {
            System.out.println(e);
        }

        if(modDialog != null && inDialog1 != null && inDialog2 != null && inDialog3 != null){
            Boolean exFlag = false;
            while(!exFlag) {
                int arrSizeX = inDialog1.openIntDialog();
                int arrSizeY = inDialog2.openIntDialog();
                int num = inDialog3.openIntDialog();
                int [][] arr = arrayMap.generate(arrSizeX, arrSizeY, ARR_MIN, ARR_MAX);
                arrayMap.printArray(arr);
                arrayMap.countOnCondition(arr,num);
                exFlag = modDialog.openDialog();
            }
        }
        else{
            System.out.println("Dialogs are prohibited![NULL]");
        }
    }
}