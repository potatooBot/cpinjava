package Pattern;

import java.util.Scanner;
import  java.util.*;
enum ActionEnum{
    appliedFilter,
    feature1Button,
    feature2Button,
    feature3Button,
    proceedButton
}
interface IAnalytics{
    public void registerAction(ActionEnum action);
    public int getNumberofActionRegisteredButNotSentToAnalyticsStore();
    public int getTotalNumberOfLoggedAction();
    public List<ActionEnum> getMostFrequent();
}
interface IAnalyticsStore{
    public void storeAction(Queue<ActionEnum> q);
    public Queue<ActionEnum> getAllStoredAction();
}

 class Analytics implements  IAnalytics {
     IAnalyticsStore analyticsStore;
     int k;
     List<ActionEnum> ds;
    static Queue<ActionEnum> storedActions = new LinkedList<>();

     public Analytics(IAnalyticsStore analyticsStore, int k) {
         this.analyticsStore = analyticsStore;
         this.k = k;
         ds = new ArrayList<>();
     }
    static class MockAnalyticsStore implements IAnalyticsStore {


         @Override
         public void storeAction(Queue<ActionEnum> q) {

          //   storedActions.addAll(q);

         }

         @Override
         public Queue<ActionEnum> getAllStoredAction() {
             return storedActions;
         }
     }
     public static void main(String[] args) {

         IAnalyticsStore mockAnalyticsStore = new MockAnalyticsStore();
         IAnalytics analytics = new Analytics(mockAnalyticsStore, 3);

         // Test input
         analytics.registerAction(ActionEnum.feature1Button);
         analytics.registerAction(ActionEnum.feature1Button);
         int totalNumberOfLoggedActions = analytics.getTotalNumberOfLoggedAction();
         analytics.registerAction(ActionEnum.feature2Button);
         analytics.registerAction(ActionEnum.feature3Button);
         int numberRegisteredNotSent = analytics.getNumberofActionRegisteredButNotSentToAnalyticsStore();
         analytics.registerAction(ActionEnum.feature2Button);
         List<ActionEnum> mostFrequentActions = analytics.getMostFrequent();
         System.out.println(totalNumberOfLoggedActions);
         System.out.println(numberRegisteredNotSent);
         System.out.println(mostFrequentActions);


     }

     @Override
     public void registerAction(ActionEnum action) {
         ds.add(action);

         if (ds.size() == k) {
             Queue<ActionEnum> queue = new LinkedList<>(ds);
             analyticsStore.storeAction(queue);
             storedActions.addAll(ds);
             ds.clear();
         }
     }

     @Override
     public int getNumberofActionRegisteredButNotSentToAnalyticsStore() {
         return ds.size();
     }

     @Override
     public int getTotalNumberOfLoggedAction() {
         return ds.size() + analyticsStore.getAllStoredAction().size();
     }

     @Override
     public List<ActionEnum> getMostFrequent() {
         Map<ActionEnum, Integer> actionCounts = new HashMap<>();

         for (ActionEnum action : storedActions) {
             actionCounts.put(action,  actionCounts.getOrDefault(action, 0) + 1);
         }
        // System.out.println(ds);
         List<ActionEnum> mostFrequentActions = new ArrayList<>(actionCounts.keySet());

         mostFrequentActions.sort((action1, action2) -> {
             int freq1 = actionCounts.get(action1);
             int freq2 = actionCounts.get(action2);
             if (freq1 == freq2) {
                 return action1.name().compareTo(action2.name());
             }
             return Integer.compare(freq2, freq1);
         });

         return mostFrequentActions;
     }
 }
