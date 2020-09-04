public class StockBestTime {
    public static void main(String[] args) {
        int [] stockPrices ={1,2,3};
        int maxProfit = 0;
        int profitCount = 0;
        int [] profitArr = new int[stockPrices.length];
        for (int i =0;i<stockPrices.length;i++) {
            int currPrice = stockPrices[i];
            for(int j = i+1;j<stockPrices.length-1;j++){
                if(stockPrices[j]>currPrice && stockPrices[j+1]<stockPrices[j]){
                    int profit = stockPrices[j] - currPrice;
                    profitArr[profitCount++] = profit;
                    break;
                }else if(stockPrices[j] > currPrice ){

                }
            }
        }
        for(int l = 0;l<profitArr.length;l++){
            System.out.print(profitArr[l] +" ,");
        }
        System.out.println();
    }
}
