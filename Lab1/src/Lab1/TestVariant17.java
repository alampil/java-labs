package Lab1;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class TestVariant17 {
	
	
	@DataProvider
	  public Object[][] dataProviderForBeginTask(){
		  return new Object[][] {{-10,10,0,10.0,10.0,20.0},{0,10,5,5.0,5.0,10.0}};
	  }
	  @Test(dataProvider = "dataProviderForBeginTask")
	  public void beginTest(double A,double B,double C,double res1,double res2,double res3) {
		  Assert.assertEquals(new Variant17().beginTask(A, B, C),new Variant17().new classForBeginTask(res1,res2,res3));
	  }
	  
	  
	  
	  @DataProvider
	  	public Object[][] dataProviderForBooleanTask(){
		  return new Object[][]{{101, true},{99,false},{100, true}};
	  }
	  @Test(dataProvider = "dataProviderForBooleanTask")
	public void booleanTest(int a, boolean b){
		Assert.assertEquals(new Variant17().booleanTask(a), b);
	}
	  
	  
	  
	  @DataProvider
	  	public Object[][] dataProviderForIntegerNegativeTask(){
		  return new Object[][]{{100},{700}};
	  }
	  @Test(dataProvider = "dataProviderForIntegerNegativeTask",expectedExceptions = AssertionError.class)
	  	public void integerTest(int a){
		  new Variant17().integerTask(a);
	  }
	  @DataProvider
	  	public Object[][] dataProviderForIntegerTask(){
		  return new Object[][]{{2000,2},{3000,3}};
	  }
	  @Test(dataProvider = "dataProviderForIntegerTask")
		public void integerTest(int a, int b){
			Assert.assertEquals(new Variant17().integerTask(a), b);
	  }
	  
	  
	  
	  @DataProvider
	  public Object[][] dataProviderForIfTask(){
		  return new Object[][]{{1,2,3,1,4,9},{3,2,1,9,4,1},{3,1,2,-3,-1,-2}};
	  }
	  @Test(dataProvider = "dataProviderForIfTask")
	  	public void ifTest(double A, double B, double C, double res1, double res2, double res3){
		  Assert.assertEquals(new Variant17().ifTask(A, B, C),new Variant17().new classForIfTask(res1,res2,res3));
	  }
	  
	  
	  
	  
	  @DataProvider
	  public Object[][] dataProviderForCaseTask(){
		  return new Object[][]{{10,"ten study assignments"},{3,"three study assignments."}};
	  }
	  @Test(dataProvider = "dataProviderForCaseTask")
	  	public void CaseTest(int n, String a){
		  Assert.assertEquals(new Variant17().caseTask(n),a);
	  }
	  
	  
	  
	  
	 
	  @DataProvider
	  public Object[][] dataProviderForForNegativeTask(){
		  return new Object[][]{{0,0},{-100,-100}};
	  }
	  @Test(dataProvider = "dataProviderForForNegativeTask", expectedExceptions = AssertionError.class)
	  public void MethodForWrongInputTest(int N, double A){
		  new Variant17().forTask(N,A);
	  }
	  @DataProvider
	  public Object[][] dataProviderForForTask(){
		  return new Object[][]{{5,1,5.0},{8,4,21845.0}};
	  }
	  @Test(dataProvider = "dataProviderForForTask")
	  public void ForTest(int N, double A, double C){
		  Assert.assertEquals(new Variant17().forTask(N,A), C);
	  }
	  	
	  	
	  	
	  @DataProvider
	    public Object[][] dataProviderForWhileNegativeTask(){
	        return new Object[][]{{0},{-100}};
	    }
	    @Test(dataProvider = "dataProviderForWhileNegativeTask", expectedExceptions = AssertionError.class)
	    public void MethodWhileWrongInputTest(int N){
	        new Variant17().whileTask(N);
	    }
	    @DataProvider
	    public Object[][] dataProviderForWhileTask(){
	        return new Object[][]{
	                {321, new Integer[]{1, 2, 3}},
	                {111, new Integer[]{1, 1, 1}},
	                {5961, new Integer[]{1, 6, 9, 5}}
	                };
	    }
	    @Test(dataProvider = "dataProviderForWhileTask")
	    public void WhileTest(int N, Integer[] b){
	        Assert.assertEquals(new Variant17().whileTask(N), b);
	    }

	  
	  
	  @DataProvider
	  public Object[][] dataProviderForArrayTask(){
		  return new Object[][]{
				  {new int[]{7,2,3,4,5,4,7,2},8,4}
				  
		  };
	  }
	  @Test(dataProvider = "dataProviderForArrayTask")
	  public void arrayTest(int [] a,int n, int max){
		  Assert.assertEquals(new Variant17().arrayTask(a, n), max);

	  }
	  	
	  @DataProvider
	    public Object[][] dataProviderForMatrixTask(){
	        return new Object[][]{
	                {
	                    new double[][]{
	                        {1., 2., 3.},
	                        {6., 8., 9.},
	                        {3., 2., 8.}},
	                    new double[][]{
	                        {6., 8., 9.},
	                        {3., 2., 8.}},
	                },
	                {
	                        new double[][]{
	                                {6., 8., 9.},
	                                {1., 2., 3.},
	                                {3., 2., 1.}},
	                        new double[][]{
	                                {6., 8., 9.},
	                                {1., 2., 3.},
	                        }
	                }
	        };
	    }
	    @Test(dataProvider = "dataProviderForMatrixTask")
	    public void matrixTest(double arr[][], double res[][]){
	        Assert.assertEquals(Arrays.deepEquals(new Variant17().martixTask(arr), res), true);
	    }

	}	  	
	  	
	  	
	  	
	  	
	