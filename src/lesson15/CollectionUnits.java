package lesson15;

import java.util.*;

public class CollectionUnits implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> rez = new ArrayList<>();
        rez.addAll(a);
        rez.addAll(b);
        return rez;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> rez = new ArrayList<>(a);
        rez.retainAll(b);
        return rez;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> rez = new HashSet<>(a);
        rez.addAll(b);
        return rez;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> rez = new HashSet<>(a);
        rez.retainAll(b);
        return rez;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> rez = new ArrayList<>(a);
        rez.removeAll(b);
        return rez;
    }
}
