/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class SupplierDirectory {
    ArrayList<Supplier> suppliers;
    
    public SupplierDirectory()
    {
        suppliers = new ArrayList();
    }
    
    public Supplier newSupplier(String n)
    {
        Supplier supplier = new Supplier(n);
        suppliers.add(supplier);
        return supplier;

    }
    public Supplier findSupplier(String id)
    {    
        for (Supplier supplier: suppliers)
        {
            if(supplier.getName().equals(id)) return supplier;
        }
        return null;
    }
    
    public ArrayList<Supplier> getSupplierList()
    {
        return suppliers;
    }
    
    private ArrayList<Supplier> supplierList;
    
    public Supplier addSupplier() 
    {
        Supplier s = new Supplier();
        supplierList.add(s);
        return s;
    }
    
    public void removeSupplier(Supplier s) 
    {
        supplierList.remove(s);
    }
    
    public Supplier searchSupplier(String keyWord) 
    {
        for(Supplier s : supplierList) 
        {
            if(keyWord.equals(s.getSupplyName())) 
            {
                return s;
            }
        }
        return null;
    }
    
}