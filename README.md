Database:

Team(img, name, matches played, matches won, matches lost, matches drawn, squad)

Player(img, name, team, dob, dod, type, MOM, BOM, FOM, total runs, total wickets, 100s, 50s, 6s, 4s)

Venue(location, capacity, name, img)

PointsTable(Rank, Team, played, WON, lOSt, points)

Matches(Mid,Team1, Team2, DOM, Venue, MatchType, Status)

MatcheSummary(Mid, Team1, Team2, MatchType, Winner, Looser, MOM, BOM, FOM, ScoreCard)

ScoreCard()


FrontEnd:

Navbar---> League Name->DB Tables Rout(Default Points table and upcoming matches)
			  
(Team-->Display list)
(Player-->Display list with search option)
(Venue-->Display List)
(Matches-->Display List)
(Match Summary --> Post all details and Rest all things should update automatically)
(PointsTable-->Display Table)

