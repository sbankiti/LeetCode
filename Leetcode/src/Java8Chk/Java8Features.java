package Java8Chk;

import Java8Chk.Developer;
import Java8Chk.Employee;
import Java8Chk.FuncInterface;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Java8Features {

    public void misscelinious(){
        String s = "santhosh";

        List<List<String>> nestedList = asList(
                asList("one:one"),
                asList("two:one", "two:two", "two:three"),
                asList("three:one", "three:two", "three:three", "three:four"));

        List<String> ls = nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList());

        for(String out : ls){
            System.out.println(out);
        }

        List<Integer> data = asList(1,2,3,4,5,6,7,8);

        List<Integer> dataout = data.stream().map(a-> 10 * a).collect(Collectors.toList());

        Optional<Integer> val = dataout.stream().filter(a->{
            if (a > 10) return true;
            return false;
        }).map(a-> a /10).reduce((a, b) -> (a+b));

        System.out.println(val);

        HashMap<String, Integer> hm = new HashMap<>();
        for(String str : ls){
            hm.put(ls.toString(), 1);
        }

        for(Map.Entry<String,Integer> hs : hm.entrySet() ){

            System.out.println(hs.getValue());
            System.out.println(hs.getKey());
        }

        //Looping through the twodimensional array
        int[][] arr = new int[][] {{1,2},{3,4},{5,6}};
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        int [] newInterval = {arr[0][0],arr[0][1]};
        System.out.println(arr);

        //Collections.sort();
    }

    public static IntPredicate even = e-> e%2 == 0;
    public static IntFunction func = e->e+2;

    public void java8Chk(){

        //Comparable
        List<Employee> lsemployee = Stream.of(new Employee("san", Arrays.asList("san@asg", "saniehth")),
                                              new Employee("ban", Arrays.asList("san@asg", "saniehth"))).toList();
        lsemployee.stream().sorted().forEach((emp)-> System.out.println(emp.getName()));

        List<Employee> lsemploy = new ArrayList<>();

        lsemploy.add(new Employee("san", Arrays.asList("san@asg", "saniehth")));
        lsemploy.add(new Employee("ban", Arrays.asList("san@asg", "saniehth")));

        Collections.sort(lsemploy,(Employee e1, Employee e2)->e1.getName().compareTo(e2.getName()));

        lsemploy.forEach((emp)-> System.out.println(emp.getName()));


        /*

        //intPredicate argument can also be written as
        IntStream.rangeClosed(1,10).filter(even).forEach((ele)-> System.out.println(func.apply(ele)));

        // Two arguments
        FuncInterface funchk = (a, b)->a == b;
        System.out.println(funchk.test(5,10));

        FuncInterface.addout(10,20);


        List<Integer> arr = asList(1,2,3,4,6,7,5);

        //arr.stream().filter((a)-> a>4).sorted().forEach(System.out::println);
        List<Integer> ls = arr.stream().filter((a)-> a>4).collect(Collectors.toList());

        Comparator<Character> val = (a,b)-> a.compareTo(b);

        System.out.println(val.compare('5','5'));

        Developer dev = new Developer("san",20);

        List<Developer> lsdev = new ArrayList<>();

        lsdev.add(dev);
        Developer dev1 = new Developer("ban",10);
        lsdev.add(dev1);

        lsdev.forEach((ele)-> System.out.println(ele.getAge()));

        System.out.println("After the sort function");
        Collections.sort(lsdev,(Developer d1,Developer d2)-> d1.getAge() - d2.getAge());
        lsdev.forEach((ele)-> System.out.println(ele.getAge()));

        //To populate a list of class we use stream

        List<Employee> lsemp = Stream.of( new Employee("san", asList("san@abc","thosh@abc")),
                                          new Employee("Ajay", asList("Ajay@123","Bankiti@123"))).toList();

        //map Functionality to get names
        //List<String> lsname = lsemp.stream().map(nm->nm.getName()).toList();
        List<String> lsname = lsemp.stream().map(Employee::getName).toList();
        System.out.println(lsname);

        List<String> lsemail = lsemp.stream().flatMap(nm->nm.getEmail().stream()).toList();
        System.out.println(lsemail);*/



    }
    public void javaStreamChk(){

        /*EURExchangeService exchg = new EURExchangeService();

        Stream<SoldProduct> products = Stream.of(new SoldProduct("san",new BigDecimal(30),"usd"),
                new SoldProduct("ban",new BigDecimal(10),"ksd"),
                new SoldProduct("tan",new BigDecimal(10),"eur"));

        /*BigDecimal serviceOrderTotal = products.filter(ele-> exchg.rate(ele.getCurrency()) != null )
                        .filter(ele->exchg.rate(ele.getCurrency()).signum() == 1)
                        .map(service -> service.getPrice().multiply(exchg.rate(service.getCurrency())))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);*/

       /* List<SimpleSoldProduct> soldprd =  products.filter(ele -> exchg.rate(ele.getCurrency()) != null)
                .filter(ele -> exchg.rate(ele.getCurrency()).signum() == 1)
                .map(ele -> new SimpleSoldProduct(ele.getName(), ele.getPrice().multiply(exchg.rate(ele.getCurrency())))).collect(Collectors.toList());

        BigDecimal serviceOrderTotal = soldprd.stream().map(ele->ele.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);

        SoldProductsAggregate soldagr = new SoldProductsAggregate(soldprd,serviceOrderTotal);*/

        //integerStream.forEach(ele->);
                /*List<String> lsstr = new ArrayList<>(Arrays.asList("san", "can", "man","ans"));
        HashMap<String, List<String>> hm = new HashMap<>();
        List<String> ls ;

        for(String str : lsstr){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String st = new String(ch);

            if(hm.containsKey(st)){
                ls = hm.get(st);
                ls.add(str);
                hm.put(st,ls);
                continue;
            }
            ls = new ArrayList<>();
            ls.add(str);
            hm.put(st,ls);
        }

        System.out.println("heoo");

        int[] arr = new int[] {1,2,3,4};

        int[] arr1 = Arrays.copyOf(arr,arr.length);

        Stream<String> strarr = Stream.of("san");
                //new String[] {"san","ban","can"};

        //Arrays.stream(strarr).map(ele-> ele + "out").forEach(ele-> System.out.println(ele));*/
    }

    public enum java8{
        DATA,
        NEWDATA,
    }
    public void java8Exercises(){

        /*IntStream intstr = IntStream.range(1,10);
        intstr.forEach(ele-> System.out.println(ele));

        //boxed() method transforms primitive integer values to object value non primitive Integer
        List<Integer> lsint = IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());

        List<Integer> lssorted = lsint.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        //List<Integer> ls = lsint.stream().collect(Collectors.toCollection(ArrayList::new));

        for (Integer l : lssorted) {

            System.out.println(l);

        }


        IntStream.of(1,2,3,4,5,5,6);

        Set<Character> st = new HashSet<>();

        st.add('a');
        st.add('d');
        st.add('d');
        st.add('z');
        st.add('f');
        st.add('k');
        st.add('c');
        st.add('e');
        st.add('l');
        st.add('o');
        st.add('m');
        st.add('s');
        st.add('t');

        HashSet<Integer> val = new HashSet<>();

        val.add(200);
        val.add(100);
        val.add(400);
        val.add(900);
        val.add(600);
        val.add(500);
        val.add(700);

        /*System.out.println(val);

        HashSet<Integer>  hs = val.stream()
                               .sorted()
                               .collect(Collectors.toCollection(HashSet::new));

        HashSet<Integer> sortedHashSet = val.stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("hashset" + hs);*/

        /*HashSet<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(200);
        numberHashSet.add(100);
        numberHashSet.add(400);
        numberHashSet.add(900);
        numberHashSet.add(600);
        numberHashSet.add(500);
        numberHashSet.add(700);

        System.out.println(numberHashSet);

        HashSet<Integer> hsi = new LinkedHashSet<>();

        HashSet<Integer> sortedHashSet = numberHashSet.stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(sortedHashSet);

        Set<Character> ts = new TreeSet<>();

        Object[] arobj = sortedHashSet.toArray();

        for(int i = 0; i<arobj.length;i ++){
            System.out.println(arobj[i]);
        }


        /*ts.add('a');
        ts.add('d');
        ts.add('d');
        ts.add('z');
        ts.add('f');
        ts.add('k');
        ts.add('c');
        ts.add('e');
        ts.add('l');
        ts.add('o');
        ts.add('m');
        ts.add('s');
        ts.add('t');*/

        //System.out.println(ts);

        /*List<Character> lsch = new ArrayList<>(Arrays.asList('a', 'b','c'));
        ts.addAll(lsch);
        System.out.println(ts);

        ts.forEach(ele-> System.out.println(ele));*/

        /*Stream<Integer> strbox = intstr.boxed();

        Stream<Object> strobj = Stream.concat(strbox,Stream.of("Hello","Santhosh"));

        strobj.forEach(ele->System.out.println(ele));*/


        /*HashSet<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(200);
        numberHashSet.add(100);
        numberHashSet.add(400);
        numberHashSet.add(900);
        numberHashSet.add(600);
        numberHashSet.add(500);
        numberHashSet.add(700);

        System.out.println(numberHashSet);

        HashSet<Integer> sortedHashSet = numberHashSet.stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(sortedHashSet);*/

        //List<SoldProduct> sp = new ArrayList<>(Arrays.asList(new SoldProduct("san", BigDecimal.ONE,"EUR"), new SoldProduct("ban",BigDecimal.TWO,"USD")));

        //Collections.sort(sp, (SoldProduct o1, SoldProduct o2)->o1.getPrice() - o2.getPrice();

        /*ArrayList<Integer> arl = new ArrayList<>();

        arl.add(200);
        arl.add(100);
        arl.add(50);
        arl.add(25);

        Collections.sort(arl,(a,b)->a - b);

        //Collections.sort(arl,(a,b)->a - b);
        ArrayList<Integer> ar2 = arl.stream().sorted((a,b)->a - b).collect(Collectors.toCollection(ArrayList::new));

        for(Integer i : ar2) System.out.println(i);

        List<Integer> ls = new ArrayList<>(Arrays.asList(1,2,3,4,56));
        List<List<Integer>> lst = new ArrayList<>();

        lst.add(ls);
        lst.add(ls);
        lst.add(ls);
        lst.add(ls);

        List<Integer> lsout = lst.stream().flatMap(ele->ele.stream()).collect(Collectors.toList());

        lsout.stream().forEach(System.out::println);

        System.out.println("Parallel");

        lsout.parallelStream().forEach(System.out::println);*/

        //Statistics to find the minimum, maximum and average numbers
        List<Character> lsint = Arrays.asList('1','1','2','3','6','5','4');
        String arr = "Santhosh";
        char[] nw = arr.toCharArray();

        String out = Arrays.toString(nw);

        IntSummaryStatistics insumm = lsint.stream().mapToInt(x->x).summaryStatistics();

        System.out.println(insumm.getMax());
        System.out.println(insumm.getMin());
        System.out.println(insumm.getAverage());
        System.out.println(insumm.getSum());

        System.out.println(lsint);
        //List<Integer> lsval = lsint.stream().distinct().collect(Collectors.toList());

        //System.out.println(lsval);

       // lsint.stream().mapToInt(x->x).peek(System.out::println).findAny().orElse(0);
      List<Integer> outlst =  lsint.stream().mapToInt(x->x).boxed().peek(System.out::println).collect(Collectors.toList());

      int[][] doub = new int[][] {{1,2,3},{4,5,6}};

      IntSummaryStatistics intsum = Arrays.stream(doub).flatMapToInt(x->Arrays.stream(x)).summaryStatistics();

        System.out.println(intsum.getSum());

        List<List<Integer>> lst = new ArrayList<>();

        lst.add(Arrays.asList(new Integer[] {1,2,3,4,5}));
        lst.add(Arrays.asList(new Integer[] {1,2,3,4,5}));

        List<Integer> lsout = lst.stream().flatMap(List::stream).collect(Collectors.toList());

        List<String> lststr = new ArrayList<>();

        Map<Integer, Integer> hm = new HashMap<>();

        /* Using the flatmap and groupby*/
        Double[] db = new Double[]{1.05,1.10,2.05,2.19};

        DoubleSummaryStatistics dbsum = Arrays.stream(db).mapToDouble(x->x).summaryStatistics();
        System.out.println("Max value from double array " + dbsum.getMax());

        String data;
        data = String.valueOf(java8.DATA);

        System.out.println(data);

}}
