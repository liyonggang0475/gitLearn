package designPatter.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyg
 * @Date: 2020-03-22 18:02
 * @Description:
 */
public class ResourcePool {
    private List<Resource> pool = new ArrayList();
    private int size = 2;

    public ResourcePool(int size) {
        this.size = size;
        for (int i = 0; i < size; i++) {
            pool.add(new Resource());
        }
    }

    public Resource getResource(){

        if(pool.size() > 0){
            Resource resource = pool.get(0);
            pool.remove(resource);
            System.out.println("pool getResource");
            return  resource;
        }
        System.out.println("new getResource");
        return new Resource();
    }

    public void releaseResource(Resource resource){
       pool.add(resource);
    }
}
