#!/usr/bin/perl


use strict;
use warnings;

my @array;
my $n = 0;
my $m = 0;
my %kwhash;
my %kwhash2;
my $temp = 0;
my $time = 0;
open (IN, "sort_quotes.csv") or die("file open error!") ;
open (OUT, ">output_quotes.csv");
open (IN2, "sort_invites.csv") or die("file open error!") ;
open (OUT2, ">output_invites.csv");
while(<IN>){
   chomp;

   @array = split;

   if( $n != 0 ){
      if(exists $kwhash{$array[2]}){
         $kwhash{$array[2]}++;
         $temp = $kwhash{$array[2]};
      }else{
         if( $n != 1 ){
            $kwhash{$array[2]} = 1;

            print OUT "$time\t$temp\n";

            $temp = $kwhash{$array[2]};
            $time = $array[2];
         } else {
             print OUT "sent_time\tquote_count\n";
             $kwhash{$array[2]} = 1;
             $temp = $kwhash{$array[2]};
             $time = $array[2];
         }


      }

      }

      $n++;
    }

    print OUT "$time\t$temp\n";

$temp = 0;
$time = 0;


while(<IN2>){
   chomp;

   @array = split;

   if( $m != 0 ){
      if(exists $kwhash2{$array[3]}){
         $kwhash2{$array[3]}++;
         $temp = $kwhash2{$array[3]};
      }else{
         if( $m != 1 ){
            $kwhash2{$array[3]} = 1;

            print OUT2 "$time\t$temp\n";

            $temp = $kwhash2{$array[3]};
            $time = $array[3];
         } else {
             print OUT2 "sent_time\tinvite_count\n";
             $kwhash2{$array[3]} = 1;
             $temp = $kwhash2{$array[3]};
             $time = $array[3];
         }


      }
      
      }

      $m++;
    }

    print OUT2 "$time\t$temp\n";

close IN;
close OUT;
close IN2;
close OUT2;

