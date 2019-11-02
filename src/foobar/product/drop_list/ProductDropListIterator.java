package foobar.product.drop_list;

/**
 * 
 */
public class ProductDropListIterator implements ProductIterator {

    /**
     * Default constructor
     */
    public ProductDropListIterator(ProductDropList productDropList) {
        this.productDropList=productDropList;
    }

    /**
     * 
     */
    private ProductDropList productDropList;
    private int pos=-1;

    /**
     * @return
     */
    public Object next() {
        // TODO implement here
        if(pos<productDropList.size()-1)
        {
            pos++;
        }
        return productDropList.get(pos);
    }

    /**
     * @return
     */
    public Object first() {
        // TODO implement here
        pos=0;
        return productDropList.get(pos);
    }

    /**
     * @return
     */
    public boolean hasNext() {
        // TODO implement here
        if(pos<productDropList.size()-1)
        {
            return true;
        }
        else
            return false;
    }

}