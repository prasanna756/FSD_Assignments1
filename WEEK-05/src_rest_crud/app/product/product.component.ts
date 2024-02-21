import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';


@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

    productList: Product[] = [];
    product: Product = { id: 0, name: '', price: 0 }; 
    searchName: string = '';



    constructor(private productService: ProductService )
    {


    }


    getAllProducts(){

          this.productService.getAll()
                   .subscribe(  
                          (products) =>
                             { 
                                this.productList = products 
                                console.log(products);
                          
                            }
                                );


    }

    


    deleteById(id:number){

        this.productService.deleteProductById(id);

    }

    getProductByName(name: string) {
      this.productService.getProductByName(name).subscribe(
        (products) => {
          this.productList = products;
          console.log(products);
        }
      );
    }

    updateProduct(id: number, product: Product) {
      this.productService.updateProduct(id, product);
    }
  

    


}
