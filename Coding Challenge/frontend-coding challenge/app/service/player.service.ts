import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { PlayerDetails } from 'src/app/model/player-details.model';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
  private baseUrl = 'http://localhost:8080/api/players';

  constructor(private http: HttpClient) { }

  getAllPlayersWithTeamNames(): Observable<Object[]> {
    return this.http.get<Object[]>(this.baseUrl + "/getallwithteamnames");
  }
  
  


}


