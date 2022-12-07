import java.util.*;

public class Main {
    public static <The> void main(String[] args) {

//        Java Collection: LinkedList Exercises [7 көнүгүү]
//        1. LinkedList тизменин биринчи элементин алуу үчүн Java программасын жазыңыз.

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(2);
//        list.add(7);
//        list.add(6);
//        list.add(4);
//        list.add(3);

//        System.out.println(list.getFirst());

//        2. LinkedList тизменин акыркы элементин алуу үчүн Java программасын жазыңыз.

        //System.out.println(list.getLast());

//        3. LinkedList тизмеде белгилүү бир элемент бар же жок экенин текшерүү үчүн Java программасын жаз.

        //  System.out.println(list.contains(4));
//        4. LinkedList тизмени массивдердин тизмесине которуу үчүн Java программасын жазыңыз.

        //  System.out.println(Arrays.toString(list.toArray()));
//        5. Эки LinkedList тизмесин салыштыруу үчүн Java программасын жазыңыз.

//        LinkedList<Integer> list1 = new LinkedList<>();
//        list1.add(2);
//        list1.add(7);
//        list1.add(6);
//        list1.add(4);
//        list1.add(3);
//
//        ListIterator<Integer> iterator = list.listIterator();
//        ListIterator<Integer> iterator1 = list1.listIterator();
//
//        boolean isTrue = false;
//        while (iterator.hasNext() && iterator1.hasNext()) {
//            if (Objects.equals(iterator.next(), iterator1.next())) {
//                isTrue = true;
//            } else isTrue = false;
//        }
//        System.out.println(isTrue);


//        6. LinkedList тизме бош же жок экенин текшерүү үчүн Java программасын жазыңыз.

        // System.out.println(list.isEmpty());

//        7. LinkedList тизмедеги элементти алмаштыруу үчүн Java программасын жазыңыз.

//        System.out.println(list.set(0, 6));
//        System.out.println(list);
//        __________________________________________________________________________________________
//
//        Java Collection: HashSet Exercises [12 көнүгүү]
//
//       HashSet<BankAccount> set = new HashSet<>(List.of(
//                new BankAccount("OPTIMA", "41692222", "7000"),
//                new BankAccount("KYRGYZSTAN", "41691111", "5000"),
//                new BankAccount("DEMIR", "41693333", "9000"),
//                new BankAccount("RSK", "41694444", "100000")));

//        1. Көрсөтүлгөн элементти HashSet топтомунун аягына кошуу үчүн Java программасын жазыңыз.
//        set.add(new BankAccount("BAKAY", "3134234", "11000"));
//        System.out.println(set);

//        2. HashSet тизмедеги бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
        // set.forEach(System.out::println);
//        3. HashSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
        // System.out.println(set.size());
//        4. HashSet топтомун бошотуу үчүн Java программасын жазыңыз.

        //set.clear();

//        5. HashSet топтомунун бош же жок экенин текшерүү үчүн Java программасын жазыңыз.

        // System.out.println(set.isEmpty());

//        6. HashSet топтомун башка хэш топтомуна клондоо үчүн Java программасын жазыңыз.
//        HashSet<BankAccount> hashSet = new HashSet<>();
//        hashSet.addAll(set);
//        System.out.println(set);
//        System.out.println("hashSet.clone() = " + hashSet.clone());
//        7. HashSet топтомун массивге айландыруу үчүн Java программасын жазыңыз.
        //  System.out.println( Arrays.toString(set.toArray()));

//        8. HashSet топтомун трисет топтомуна айландыруу үчүн Java программасын жазыңыз.

//        9. HashSet топтомун List/ ArrayListке айландыруу үчүн Java программасын жазыңыз.
//            ArrayList<BankAccount> arrayList = new ArrayList<>();
//            arrayList.addAll(set);
//        System.out.println(arrayList);

//        10. Эки HashSet топтомун салыштыруу үчүн Java программасын жазыңыз.
//              HashSet<BankAccount> hashSet = new HashSet<>(List.of(
//                      new BankAccount("DEMIR", "41693333", "9000"),
//                      new BankAccount("RSK", "41694444", "100000")));
//        System.out.println(hashSet.containsAll(set));

//        11. Эки топтомду салыштыруу жана эки топтомдо бирдей элементтерди сактоо үчүн Java программасын жазыңыз.

//        HashSet<BankAccount> hashSet = new HashSet<>(List.of(
//                new BankAccount("OPTIMA", "41692222", "7000"),
//                new BankAccount("KYRGYZSTAN", "41691111", "5000"),
//                new BankAccount("DEMIR", "41693333", "9000"),
//                new BankAccount("RSK", "41694444", "100000")));
//        System.out.println(hashSet.equals(set));


//        12. HashSet топтомунан бардык элементтерди алып салуу үчүн Java программасын жазыңыз.
//         set.clear();
//        System.out.println(set);
//        _____________________________________________________________________________________________
//
//        Java Collection: TreeSet Exercises [16 көнүгүүлөр]
//
//        1. Жаңы TreeSet топтомун түзүү үчүн Java программасын жазыңыз, бир нече түстөрдү  кошуп, TreeSet топтомун басып чыгарыңыз.
           //TreeSet<String> treeSet = new TreeSet<>(List.of("White","Black","Pink"," Blue"));
//        System.out.println(treeSet);


//        2. TreeSet топтомундагы бардык элементтерди кайталоо үчүн Java программасын жазыңыз.

//         treeSet.forEach(System.out::println);

//        3. Белгиленген TreeSet топтомунун бардык элементтерин башка TreeSet топтомуна кошуу үчүн Java программасын жазыңыз.
//           TreeSet<String> stringTreeSet = new TreeSet<>(List.of("Orange"));
//           stringTreeSet.addAll(treeSet);
//        System.out.println(stringTreeSet);

//        4. Берилген TreeSet топтомундагы элементтердин тескери иреттүү көрүнүшүн түзүү үчүн Java программасын жазыңыз.
      //  System.out.println(treeSet.descendingSet());

//        5. TreeSet топтомундагы биринчи жана акыркы элементтерди алуу үчүн Java программасын жазыңыз.
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());

//        6. TreeSet тизмегин башка TreeSet топтомуна клондоо(clone) үчүн Java программасын жазыңыз.



//        7. TreeSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
        //System.out.println(treeSet.size());
//        8. Эки TreeSet топтомун салыштыруу үчүн Java программасын жаз.
//         TreeSet<String> set = new TreeSet<>(List.of("White","Black","Pink"," Blue"));
//        System.out.println(set.equals(treeSet));

//        9. Tree топтомундагы 7ден аз сандарды табуу үчүн Java программасын жаз.
//        TreeSet<Integer> treeSet = new TreeSet<>(List.of(1, 3, 4, 5, 8, 9));
//        System.out.println(treeSet.headSet(7));

//        10. Берилген элементтен чоң же ага барабар болгон TreeSet жыйындысынын элементин алуу үчүн Java программасын жазыңыз.
//        TreeSet<Integer> treeSet = new TreeSet<>(List.of(1,2,4,5,6,9,8));
//
//        boolean b = true;
//        System.out.println(treeSet.tailSet(8, b));


//        11. Берилген элементтен кичине же ага барабар болгон TreeSet топтомундагы элементти алуу үчүн Java программасын жазыңыз.
              //10 mn chogu ishteit !
       // System.out.println(treeSet.headSet(8, b));


//        12. TreeSet топтомунун биринчи элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
//                TreeSet<Integer> treeSet = new TreeSet<>(List.of(2,4,5,1,6,9,8));
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.remove(treeSet.first()));

//        13. TreeSet топтомунун акыркы элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
     //   System.out.println(treeSet.last());
     //   System.out.println(treeSet.remove(treeSet.last()));

//        14. Берилген элементти TreeSet жыйындысынан алып салуу үчүн Java программасын жазыңыз.
//        System.out.println(treeSet.remove(5));
//        System.out.println(treeSet);

    }
}