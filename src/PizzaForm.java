
import RestFood.RestDishes.FabricFilling.FillingFactory;
import RestFood.RestDishes.Pizza;
import RestFood.RestDishes.PizzaEnums.*;
import RestFood.RestDishes.RestIngredients.*;
import java.util.ArrayList;
import java.util.EnumSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anton
 */
public class PizzaForm extends javax.swing.JPanel {

    /**
     * Creates new form PizzaForm
     */
    DefaultListModel AddIngModel = new DefaultListModel();
    DefaultListModel AddedIngModel = new DefaultListModel();
    DefaultListModel PizzaModel = new DefaultListModel();
    DefaultListModel listOrderModel;
    DefaultComboBoxModel DoughModel = new DefaultComboBoxModel();
    DefaultComboBoxModel SauceModel = new DefaultComboBoxModel();
    
    PizzaMenu pizzaChoosed = PizzaMenu.YourPizza;
    PizzaSize pizzaSize;
    public PizzaForm(DefaultListModel listOrderModel) {
        initComponents();
        initModels();
        initComboBox();
        initButtons();
        setOrderModel(listOrderModel);
    }
    public void setOrderModel(DefaultListModel listOrderModel)
    {
        this.listOrderModel = listOrderModel;
    }
    public void initModels()
    {
        EnumSet.allOf(IngredientsList.class)
                .forEach(ing -> AddIngModel.addElement(ing.getIng()));
        listIng.setModel(AddIngModel);
        listAddedIng.setModel(AddedIngModel);
                EnumSet.allOf(PizzaMenu.class)
                .forEach(pizza -> PizzaModel.addElement(pizza));
        listPizza.setModel(PizzaModel);
        listPizza.setSelectedIndex(PizzaModel.getSize() - 1);
        AddedIngModel.addElement(IngredientsList.Cheese.getIng());
        
    }
    
    public void initComboBox()
    {
        EnumSet.allOf(PizzaDough.class)
                .forEach(ing -> DoughModel.addElement(ing));
        cbDough.setModel(DoughModel);
        EnumSet.allOf(PizzaSauce.class)
                .forEach(ing -> SauceModel.addElement(ing));
        cbSauce.setModel(SauceModel);
    }
    public void initButtons()
    {
        btnTglMed.setSelected(true);
        pizzaSize = PizzaSize.Medium;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listPizza = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAddedIng = new javax.swing.JList<>();
        cbDough = new javax.swing.JComboBox<>();
        btnTglSmall = new javax.swing.JToggleButton();
        btnTglMed = new javax.swing.JToggleButton();
        btnTglBig = new javax.swing.JToggleButton();
        cbSauce = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listIng = new javax.swing.JList<>();
        btnAddIng = new javax.swing.JButton();
        btnRemoveIng = new javax.swing.JButton();
        btnAddOrder = new javax.swing.JButton();
        btnSetPizza = new javax.swing.JButton();

        jScrollPane1.setViewportView(listPizza);

        jScrollPane2.setViewportView(listAddedIng);

        btnTglSmall.setText("Small");
        btnTglSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTglSmallActionPerformed(evt);
            }
        });

        btnTglMed.setText("Medium");
        btnTglMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTglMedActionPerformed(evt);
            }
        });

        btnTglBig.setText("Big");
        btnTglBig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTglBigActionPerformed(evt);
            }
        });

        jLabel1.setText("Dough:");

        jLabel2.setText("Sauce:");

        jScrollPane3.setViewportView(listIng);

        btnAddIng.setText("AddIng");
        btnAddIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddIngActionPerformed(evt);
            }
        });

        btnRemoveIng.setText("Remove ing");
        btnRemoveIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveIngActionPerformed(evt);
            }
        });

        btnAddOrder.setText("Add to order");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        btnSetPizza.setText("SetPizza");
        btnSetPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRemoveIng, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSetPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTglSmall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTglMed, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTglBig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDough, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSauce, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnAddIng, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addComponent(btnAddOrder)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDough, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSauce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTglSmall)
                            .addComponent(btnTglMed)
                            .addComponent(btnTglBig))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSetPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddIng)
                        .addComponent(btnAddOrder))
                    .addComponent(btnRemoveIng)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTglMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTglMedActionPerformed
        // TODO add your handling code here:
        btnTglMed.setSelected(true);
        btnTglSmall.setSelected(false);
        btnTglBig.setSelected(false);
        pizzaSize = PizzaSize.Medium;
    }//GEN-LAST:event_btnTglMedActionPerformed

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        // TODO add your handling code here:
        PizzaDough pizzaDough = (PizzaDough)DoughModel.getSelectedItem();
        PizzaSauce pizzaSauce = (PizzaSauce)SauceModel.getSelectedItem();
        ArrayList<Ingredients> pizzaIngredients = new ArrayList<Ingredients>();
        for(int i = 0; i < AddedIngModel.getSize(); i++)
        {
            pizzaIngredients.add((Ingredients)AddedIngModel.get(i));
        }
        Pizza createPizza = new Pizza(pizzaChoosed.getPizzaName(), pizzaSize, pizzaDough
                , pizzaSauce, pizzaIngredients, new FillingFactory());
        JOptionPane.showMessageDialog(null, createPizza.getDescribe());
        this.listOrderModel.addElement(createPizza);
                
        
    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void btnAddIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddIngActionPerformed
        // TODO add your handling code here:
        if(!listIng.isSelectionEmpty())
        {
            try{
                AddedIngModel.addElement(AddIngModel.get(listIng.getSelectedIndex()));
                Ingredients ing = (Ingredients)AddedIngModel.get(AddedIngModel.size() - 1);
                JOptionPane.showMessageDialog(null,"Name:"  + ing.getName()+ "  Price:" + ing.getPrice());
            }catch(ArrayIndexOutOfBoundsException e)
            {
                JOptionPane.showMessageDialog(null, "Error!Wrrong ingredient selection!");
            }
        }
    }//GEN-LAST:event_btnAddIngActionPerformed

    private void btnRemoveIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveIngActionPerformed
        // TODO add your handling code here:
        if(!listAddedIng.isSelectionEmpty())
        {
            try{
                int selectedIndex = listAddedIng.getSelectedIndex();
                AddedIngModel.remove(selectedIndex);
                changeSelectedIndex(listAddedIng, selectedIndex);
            }catch(ArrayIndexOutOfBoundsException e)
            {
                JOptionPane.showMessageDialog(null, "Error!Wrrong ingredient selection!");
            }
        }
    }//GEN-LAST:event_btnRemoveIngActionPerformed

    private void btnSetPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetPizzaActionPerformed
        // TODO add your handling code here:
        if(!listPizza.isSelectionEmpty())
        {
            ArrayList<Ingredients> ing = new ArrayList<Ingredients>();
            AddedIngModel.clear();
            pizzaChoosed = (PizzaMenu)PizzaModel.get(listPizza.getSelectedIndex());
            ing.addAll(pizzaChoosed.getPizzaIng());
            for(Ingredients i : ing){
                AddedIngModel.addElement(i);
            }
        }
        
    }//GEN-LAST:event_btnSetPizzaActionPerformed

    private void btnTglSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTglSmallActionPerformed
        // TODO add your handling code here:
        btnTglSmall.setSelected(true);
        btnTglMed.setSelected(false);
        btnTglBig.setSelected(false);
        pizzaSize = PizzaSize.Small;
    }//GEN-LAST:event_btnTglSmallActionPerformed

    private void btnTglBigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTglBigActionPerformed
        // TODO add your handling code here:
        btnTglSmall.setSelected(false);
        btnTglMed.setSelected(false);
        btnTglBig.setSelected(true);
        pizzaSize = PizzaSize.Big;
    }//GEN-LAST:event_btnTglBigActionPerformed

    private void changeSelectedIndex(JList list, int index)
    {
        DefaultListModel model = (DefaultListModel) list.getModel();
        if(index >= model.getSize() && model.getSize() > 0) { list.setSelectedIndex(model.getSize() - 1); }
        else if(model.getSize() > 0) { list.setSelectedIndex(index); }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddIng;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnRemoveIng;
    private javax.swing.JButton btnSetPizza;
    private javax.swing.JToggleButton btnTglBig;
    private javax.swing.JToggleButton btnTglMed;
    private javax.swing.JToggleButton btnTglSmall;
    private javax.swing.JComboBox<String> cbDough;
    private javax.swing.JComboBox<String> cbSauce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listAddedIng;
    private javax.swing.JList<String> listIng;
    private javax.swing.JList<String> listPizza;
    // End of variables declaration//GEN-END:variables
}