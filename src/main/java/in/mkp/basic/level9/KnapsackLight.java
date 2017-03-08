package in.mkp.basic.level9;

/**
 * Created by mkumar on 3/6/17.
 */
public class KnapsackLight {

    public static void main(final String[] args) {
        KnapsackLight knapsackLight = new KnapsackLight();
        System.out.println(knapsackLight.knapsackLight(10, 5 , 6 , 4, 8));
        System.out.println(knapsackLight.knapsackLight(3, 5 , 3 , 8, 10));
        System.out.println(knapsackLight.knapsackLight(4, 3 , 3 , 4, 4));
        System.out.println(knapsackLight.knapsackLight(15, 2 , 20, 3, 2));
    }

    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        int maxValue = value1 + value2;
        int totalWeight = weight1 + weight2;

        if (totalWeight > maxW) {
            //try to remove 2
            if ((totalWeight-weight2) <= maxW && (maxValue - value1) <= (maxValue - value2)) {
                maxValue-=value2;
            }
            // try to remove 1
            else if ((totalWeight-weight1) <= maxW && (maxValue - value2) <= (maxValue - value1)) {
                maxValue-=value1;
            }
            else if (totalWeight-weight2 <= maxW) {
                maxValue-=value2;
            }
            else if (totalWeight-weight1 <= maxW) {
                maxValue-=value1;
            }
            else {
                maxValue=0;
            }
        }

        return maxValue;
    }


}
