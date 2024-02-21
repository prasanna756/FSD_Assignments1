import { Component, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { Policy } from 'src/app/models/policy.model';
import { addPolicy, deletePolicy, updatePolicy } from 'src/app/store/actions/policy.actions';
import { selectPolicies } from 'src/app/store/reducers/policy.reducer';

@Component({
  selector: 'app-policy-list',
  templateUrl: './policy-list.component.html',
  styleUrls: ['./policy-list.component.css']
})
export class PolicyListComponent implements OnInit {

  newPolicy: Policy = {
    policyId: 0,
    policyName: '',
    policyDescription: '',
    company: '',
    policyType: '',
    initialDeposit: 0,
    termPeriod: '',
    termAmount: 0,
    interest: 0
  };
  policies$: Observable<Policy[]>;

  constructor(private store: Store<{ policy: { policies: Policy[] } }>) {
    this.policies$ = this.store.select(selectPolicies);
  }

  ngOnInit(): void {
  }

  addPolicy(): void {
    if (!this.isPolicyValid(this.newPolicy)) {
      return;
    }
    this.newPolicy.policyId =Math.random();
    this.store.dispatch(addPolicy({ policy: this.newPolicy }));
    this.resetNewPolicy();
  }

  updatePolicy(policy: Policy): void {
    if (!this.isPolicyValid(policy)) {
      return;
    }
    this.store.dispatch(updatePolicy({ policy }));
  }

  deletePolicy(policyId: number): void {
    this.store.dispatch(deletePolicy({ policyId }));
  }

  private resetNewPolicy(): void {
    this.newPolicy = {
      policyId: 0,
      policyName: '',
      policyDescription: '',
      company: '',
      policyType: '',
      initialDeposit: 0,
      termPeriod: '',
      termAmount: 0,
      interest: 0
    };
  }

  private isPolicyValid(policy: Policy): boolean {
    return policy.policyName.trim() !== '' && policy.policyDescription.trim() !== '';
  }

}



// import { Component, OnInit } from '@angular/core';
// import { Store } from '@ngrx/store';
// import { Observable } from 'rxjs';
// import { Policy } from 'src/app/models/policy.model';
// import { selectAllPolicies, selectPolicyLoading } from '../store/reducers/policy.selector';
// import * as PolicyActions from '../store/actions/policy.actions';

// @Component({
//   selector: 'app-policy-list',
//   templateUrl: './policy-list.component.html',
// })
// export class PolicyListComponent implements OnInit {
//   policies$: Observable<Policy[]>;
//   isLoading$: Observable<boolean>;
//   newPolicyName: string = '';
//   newPolicyDescription: string = '';
//   newPolicyCompany: string = '';
//   newPolicyType: string = '';
//   newInitialDeposit: number = 0;
//   newTermPeriod: string = '';
//   newTermAmount: number = 0;
//   newInterest: number = 0;

//   constructor(private store: Store<{ policy: { policies: Policy[]; loading: boolean } }>) {
//     this.policies$ = this.store.select(selectAllPolicies);
//     this.isLoading$ = this.store.select(selectPolicyLoading);
//   }


//   ngOnInit(): void {
//     this.store.dispatch(PolicyActions.loadPolicies());
//   }

//   onAddPolicy(): void {
//     const newPolicy: Policy = {
//       policyId: Date.now(), 
//       policyName: this.newPolicyName,
//       policyDescription: this.newPolicyDescription,
//       company: this.newPolicyCompany,
//       policyType: this.newPolicyType,
//       initialDeposit: this.newInitialDeposit,
//       termPeriod: this.newTermPeriod,
//       termAmount: this.newTermAmount,
//       interest: this.newInterest,
//     };

//     this.store.dispatch(PolicyActions.addPolicy({ policy: newPolicy }));
//     this.clearForm();
//   }

//   deletePolicy(policyId: number): void {
//     this.store.dispatch(PolicyActions.deletePolicy({ policyId }));
//   }

//   private clearForm(): void {
//     this.newPolicyName = '';
//     this.newPolicyDescription = '';
//     this.newPolicyCompany = '';
//     this.newPolicyType = '';
//     this.newInitialDeposit = 0;
//     this.newTermPeriod = '';
//     this.newTermAmount = 0;
//     this.newInterest = 0;
//   }
// }
