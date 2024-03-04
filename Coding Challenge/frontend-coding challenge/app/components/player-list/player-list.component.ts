import { Component, OnInit } from '@angular/core';
import { PlayerDetails } from 'src/app/model/player-details.model';
import { PlayerService } from '../../service/player.service';

@Component({
  selector: 'app-player-list',
  templateUrl: './player-list.component.html',
  styleUrls: ['./player-list.component.css']
})
export class PlayerListComponent implements OnInit {
  playersWithTeamNames: any[] = [];


  constructor(private playerService: PlayerService) { }
  ngOnInit(): void {
    this.loadPlayersWithTeamNames();
  }


  loadPlayersWithTeamNames() {
    this.playerService.getAllPlayersWithTeamNames().subscribe(
      (data: any[]) => {
        this.playersWithTeamNames = data;
      },
      error => console.log(error)
    );
  }
}
