import { Component } from '@angular/core';
import { FormBuilder,FormGroup,Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'directives';

  policyForm!: FormGroup;
  submitted = false;
  successMessage: string | null = null;

  constructor(private formBuilder: FormBuilder) { 

  }
  ngOnInit():void{
    this.policyForm = this.formBuilder.group({
      policyName: ['', [Validators.required]],
      policyDescription: ['', [Validators.required]],
      company: ['', [Validators.required]],
      policytype: ['', [Validators.required]],
      initialDeposit: [null, [Validators.required,Validators.pattern(/^(Monthly|Quarterly|Half-Yearly|Annually)$/)]],
      termAmount: [null, [Validators.required, Validators.min(0)]],
      interest: [null, [Validators.required]]
    });
  }
  get f() {
     return this.policyForm.controls;
}
onSubmit() {
  this.submitted = true;
  if (this.policyForm.invalid) {
    return;
  }
  this.successMessage = 'Form submitted successfully!';
  console.log('Form Submission success!');
}
}
