function[mutatedGene]=mutateGene(gene,mutationRate)
%%
%A gene is row of the chromosome matrix, this function executes a "mutation" on
%those rows. There are 3 types of mutation: substitution or change, is when
%a bit is changed; addition, is when a couple of bits are set to 11; and
%deletion, is when a couple of bits are set to zero. Those concepts are
%different in biology.
%This function takes as arguments the gene and the mutation rate parameter
%which is a 1x3 vector.
%
%mutatedGene = MUTATEGENE(gene,mutationRate);
%gene is a row vector of integer 0 and 1 expressed in an sparse matrix.
%0<mutationRate<1 is a 1 by 3 row vector with the mutation probability in the
%following order: mutationRate(1) is mutation probability by addition;
%mutationRate(2) is the mutation probability by deletion and
%mutationRate(3) is the mutation probability by substitution.
%
%Example:
%
%>>gene1 = sparse(1,5);
%>>gene1(1,[randi([1,5]),randi([1,5]),randi([1,5])])=1
%
% gene1 =
% 
%    (1,2)        1
%    (1,3)        1
%
%>>gene2 = mutateGene(gene1,[0,0,1]);
%
% gene2 =
% 
%    (1,1)        1
%    (1,2)        1
%    (1,3)        1

%%
if nargin==2
    sizeChr=length(gene);
    if length(mutationRate)==3
        mutatedGene=gene;
        adition=mutationRate(1);
        deletion = mutationRate(2);
        change = mutationRate(3);
        if change>rand
            i=randi([1,sizeChr]);
            mutatedGene(i)=double(~mutatedGene(i));
        elseif adition>rand
            i=randi([1,sizeChr-1]);
            mutatedGene(i)=1;
            mutatedGene(i+1)=1;
        elseif deletion>rand
            i=randi([1,sizeChr-1]);
            mutatedGene(i)=0;
            mutatedGene(i+1)=0;
        end
    end
end
